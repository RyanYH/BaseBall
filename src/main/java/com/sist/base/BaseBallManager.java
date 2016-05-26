package com.sist.base;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class BaseBallManager {

	public static void main(String[] args) {
		try
		{
			Document doc=Jsoup.connect("http://www.koreabaseball.com/Record/Player/HitterBasic/Detail1.aspx").get();
			Elements tr=doc.select("tbody tr");
			int j=0;
			for(int i=0;i<tr.size();i++)
			{
				Iterator<Element> td=tr.iterator();
				while(td.hasNext())
				{
					if(j>=25) break;
					Element e=td.next();
					System.out.println(e.text());
					j++;
				}
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}







