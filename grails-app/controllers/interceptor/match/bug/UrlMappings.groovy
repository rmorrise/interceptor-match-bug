package interceptor.match.bug

class UrlMappings {

    static mappings = {
        post "/MyData"(controller: "MyData", action: "process")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
