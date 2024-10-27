package com.inflearn.hyewkim.exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MyUnCheckedTest {
    @Test
    void checkedCatch() {
        Service service = new Service();
        service.callCatch();
    }

    @Test
    void checkedThrow() {
        Service service = new Service();
        assertThatThrownBy(() -> service.callThrow()).isInstanceOf(MyUnCheckedException.class);
    }

    static class Service {
        Repository repository = new Repository();

        // 필요한 경우에만 catch 하여 처리한다.
        void callCatch() {
            try {
                repository.call();
            } catch (MyUnCheckedException ex) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
        }

        // 선언적으로 MyUnCheckedException을 throw 하지 않아도 컴파일 에러 발생 x
        void callThrow() {
            repository.call();
        }
    }

    static class Repository {
        void call() {
            throw new MyUnCheckedException("UnChecked Exception 발생");
        }
    }

    /*
    RuntimeException 의 하위 예외는 unchecked exception으로 처리됨
    exception이 처리되지 않을 경우 컴파일 에러는 발생하지 않음.
    * */
    static class MyUnCheckedException extends RuntimeException {
        public MyUnCheckedException(String message) {
            super(message);
        }
    }
}
