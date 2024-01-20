package kaijuapi

import groovy.transform.CompileStatic
import grails.rest.RestfulController

@CompileStatic
class BattleController extends RestfulController {
	static responseFormats = ['json', 'xml']
    BattleController() {
        super(Battle)
    }
}