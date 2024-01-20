package kaijuapi

import groovy.transform.CompileStatic
import grails.rest.RestfulController

@CompileStatic
class KaijuController extends RestfulController {
    static responseFormats = ['json', 'xml']
    KaijuController() {
        super(Kaiju)
    }
}