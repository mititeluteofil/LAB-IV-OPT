/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Ssive
 */
import java.util.*;
import java.nio.file.*;
import java.io.Serializable;
import java.io.*;
public abstract class Document implements Serializable{

	protected String title;
	protected List<String> author = new ArrayList<String>();
	protected String path;
	protected Integer year;

	public Document(String title, String pathIn, int year, String...authors) {
		this.title = title;
		this.path = pathIn;
		this.year = year;
		for (int i = 0 ; i < authors.length; i++) {
			this.author.add(authors[i]);
		}
	}
	public Document(String title, String pathIn) {
		this.title = title;
		this.path = pathIn;
	}
	
	
	public String getPath() {
		return path;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public List<String> getAuthor() {
		return author;
	}
        
       public String getAuthors(Integer i) {
		return author.get(i);
	}
        
	@Override
	public String toString() {
		return title+ ' '+year+' '+path + ' ' + author;
		
	}
}