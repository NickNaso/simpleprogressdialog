/*******************************************************************************
* Copyright (c) 2012, 2013 Nacios Technologies.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License Version 2.0
* which accompanies this distribution, and is available at
* http://www.apache.org/licenses/
*
* Contributors:
* Nacios Technologies - initial API and implementation
* Mauro Brasiliano - Nicola Del Gobbo - Vincenzo Villani
*******************************************************************************/

cordova.define("cordova/plugin/simpleProgressDialog", function(require, exports, module) {
	var exec = require("cordova/exec");
	var SimpleProgressDialog = function () {};
	
	SimpleProgressDialog.prototype.show = function(values) {
	    cordova.exec(null,null,"simpleProgressDialog","show",[values]);    
	};
	
	SimpleProgressDialog.prototype.hide = function(){
		cordova.exec(null,null,"simpleProgressDialog","hide",[]);
	};
	
	var spDialog  = new SimpleProgressDialog();
	module.exports = spDialog;
});

if (!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.spDialog) {
    window.plugins.spDialog = cordova.require("cordova/plugin/simpleProgressDialog");
}
