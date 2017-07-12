package interceptor.match.bug

import org.springframework.http.HttpStatus


class TestInterceptor {
    public TestInterceptor() {
        match controller: 'MyData'
    }

    boolean before() {
        response.setStatus(HttpStatus.OK)
        return false
    }

    boolean after() {
        true
    }

    void afterView() {
        // no-op
    }
}
