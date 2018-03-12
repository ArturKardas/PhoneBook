/* 
 *  Komunikator sieciowy
 *   - program uruchamiajacy serwer i dwóch klientów
 *
*  Autor: Artur Kardas
 *   Data: 09.01.2018 r.
 */

class Tester {
	
	public static void main(String [] args){
		new PhoneBookServer();
		
		try{
			Thread.sleep(1000);
		} catch(Exception e){}
			
	  	new PhoneBookClient("Klient");

	}
	
}