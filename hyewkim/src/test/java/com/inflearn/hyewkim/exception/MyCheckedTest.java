package com.inflearn.hyewkim.exception;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
//import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

//@Slfj4
public class MyCheckedTest {
    /*checked 예외의 경우 catch 하여 처리하거나 throw 하지 않으면 컴파일 에러 발생*/
    @Test
    public void checkedCatch() {
        Service service = new Service();
        service.callCatch();
    }

    @Test
    public void checkedThrow() {
        Service service = new Service();
        assertThatThrownBy(() -> service.callThrow())
                .isInstanceOf(MyCheckedException.class);
    }

    static class Service {
        Repository repository = new Repository();

        void callCatch() {
            try {
                repository.call();
            } catch (MyCheckedException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();

            }
        }

        void callThrow() throws MyCheckedException {
            repository.call();
        }

    }

    static class Repository {
        public void call() throws MyCheckedException {
            throw new MyCheckedException("ex");
        }
    }

    static class MyCheckedException extends Exception {
        public MyCheckedException(String message) {
            super(message);
        }
    }

}
