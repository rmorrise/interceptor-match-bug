package interceptor.match.bug

import org.springframework.http.HttpStatus

class MyDataController {
	static responseFormats = ['json', 'xml']
	
    def process() {
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value())
        return
    }
}
