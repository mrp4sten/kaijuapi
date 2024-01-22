package kaijuapi

import grails.compiler.GrailsCompileStatic
import grails.rest.Resource
import kaijuapi.Kaiju

/**
 * Represents a battle between Kaijus.
 */
@GrailsCompileStatic
@Resource(uri='/battles', formats=['json', 'xml'])
class Battle {

    String location
    Kaiju winner
    Kaiju loser
    static hasMany = [kaijus: Kaiju]
    
    static constraints = {
      location blank:false
      winner blank:false
      loser blank:false
   }

}
