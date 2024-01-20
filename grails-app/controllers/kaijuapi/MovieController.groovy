package kaijuapi

import groovy.transform.CompileStatic
import grails.rest.RestfulController

@CompileStatic
class MovieController extends RestfulController {
    static responseFormats = ['json', 'xml']
    MovieController() {
        super(Movie)
    }
}