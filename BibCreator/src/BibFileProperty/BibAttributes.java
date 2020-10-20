package BibFileProperty;

import java.util.List;

class Authors{
	
	private String author;
	
	public Authors(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

public class BibAttributes {
	private List<Authors> authors;
	private String journal;
	private String title;
	private int year;
	private String volume;
	private int number;
	private String pages;
	private String doi;
	private String issn;
	private String month;
	
	public BibAttributes() {}
	
	public BibAttributes(List<Authors> author, String journal, String title, int year, String volume, int number,
			String pages, String doi, String issn, String month) {
		this.authors = author;
		this.journal = journal;
		this.title = title;
		this.year = year;
		this.volume = volume;
		this.number = number;
		this.pages = pages;
		this.doi = doi;
		this.issn = issn;
		this.month = month;
	}
	
	public List<Authors> getAuthor() {
		return authors;
	}
	public void setAuthor(List<Authors> author) {
		this.authors = author;
	}
	public String getJournal() {
		return journal;
	}
	public void setJournal(String journal) {
		this.journal = journal;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	
}



/*

author={J. Park and J. N. James and Q. Li and Y. Xu and W. Huang}, 
journal={IEEE Transactions on Vehicular Technology}, 
title={Optimal DASH-Multicasting over LTE}, 
year={2018}, 
volume={PP}, 
number={99}, 
pages={15-27}, 
keywords={Forward error correction;Long Term Evolution;Maintenance engineering;Multicast communication;Resource management;Static VAr compensators;Streaming media;DASH;LTE;convex optimization;eMBMS;multicasting}, 
doi={10.1109/TVT.2018.2789899}, 
ISSN={0018-9545}, 
month={January},
*/