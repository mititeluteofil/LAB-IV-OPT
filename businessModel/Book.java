/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessModel;
public class Book extends Document{
	
	public Book(String title, String path, int year , String...authors) {
		super(title, path, year, authors);
	}
	
}
