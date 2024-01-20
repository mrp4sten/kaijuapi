package kaijuapi

import grails.compiler.GrailsCompileStatic
import grails.rest.Resource

@GrailsCompileStatic
@Resource(uri='/kaijus', formats=['json', 'xml'])
class Kaiju {

    String name
    String img
    String ability
    int firstAppearance

    static constraints = {
        name blank:false
        img blank:false
        ability blank:false
        firstAppearance blank:false
    }
}