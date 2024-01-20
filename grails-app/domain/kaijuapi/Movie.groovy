package kaijuapi

import grails.compiler.GrailsCompileStatic
import grails.rest.Resource

@GrailsCompileStatic
@Resource(uri='/movies', formats=['json', 'xml'])
class Movie {
    String title
    int releaseYear
    String director
    static hasMany = [kaijus: Kaiju]

    static constraints = {
        title blank:false
        releaseYear blank:false
        director blank:false
    }
}
