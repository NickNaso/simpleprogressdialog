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

package it.nacios.app.dialog;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.ProgressDialog;
import android.content.Context;

public class SimpleProgressDialog extends CordovaPlugin {

	private ProgressDialog spd = null;
	@Override
	public boolean execute(String action, final JSONArray args, final CallbackContext callbackContext) throws JSONException {
		if("show".equals(action)){
			final Context currentCtx = cordova.getActivity();
			cordova.getActivity().runOnUiThread(new Runnable() {	
				@Override
				public void run() {
					String msg = null;
					try{
						msg = args.getString(0);
					}
					catch(Exception e){
						msg = "Attendere prego...";		
					}
					spd = ProgressDialog.show(currentCtx, "", msg);
					callbackContext.success();
				}
			});
			
			return true;
		}
		else if("hide".equals(action)){
			cordova.getActivity().runOnUiThread(new Runnable() {	
				@Override
				public void run() {
					if(spd != null){
						spd.dismiss();
						spd = null;
					}
					callbackContext.success();
				}
			});
			return true;
		}
		
		return false;
	}
	
}
