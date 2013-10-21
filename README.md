## simpleProgressDialog plugin per PhoneGap ##
#### Creato da Nacios Technologies <a href="https://twitter.com/NaciosTechnolog">@NaciosTechnolog</a> - https://www.facebook.com/NaciosTechnologies - www.nacios.it - info@nacios.it ####
=============================================================================================================================

## PhoneGap Plugin che consente di  richiamare il progress dialog nativo su sistema Andorid ##

Per maggiori informazioni consultare il seguente link: http://www.nacios.it/phonegap-progress-dialog-android/

## Installare il plugin nel proprio progetto ##

1) Per installare il plugin, copiare il file simpleProgressDialog.js all'interno della cartella /assets/www/ e includere il riferimento all'interno dei files html.

`<script type="text/javascript" charset="utf-8" src="simpleProgressDialog.js"></script>`

2) All'interno della cartela src creare il package 'it.nacios.app.dialog' e successivamente copiarvi il file SimpleProgressDialog.java

`mkdir <your_project>/src/it/nacios/app/dialog`

`cp <your_path>/AppPreferences.java <your_project>/src/it/nacios/app/dialog`

3) Nel file res/xml/config.xml aggiungere la seguente linea di codice:

 `<plugin name="simpleProgressDialog" value="it.nacios.app.dialog.SimpleProgressDialog"/>`


## Uso del plugin ##

1) Creare il riferimento al plugin richiamando il comando cordova.exec():

`var spd = cordova.require("cordova/plugin/simpleProgressDialog");`

2) Per visualizzare il progress dialog con un determinato messaggio bisogna richiamare il metodo show("messaggio da visualizzare") dell'oggetto SimpleProgressDialog:

`spd.show('Attendere prego...');`

3) Per chiudere il progress dialog bisogna richiamare il metodo hide() dell'oggetto SimpleProgressDialog:

`spd.hide();`


Nel caso in cui ci fossero una serie di operazioni in sequenza che si intende segnalare è opportuno richiamare il metodo show() più volte e soltanto alla fine il metodo hide().
Questo accorgimento migliora sensibilmente le prestazioni.