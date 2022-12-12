/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author meenalsarwaiya
 */



import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

//import com.squareup.okhttp.OkHttpClient;
//import com.squareup.okhttp.Request;
//import com.squareup.okhttp.Response;
//import com.squareup.okhttp.Interceptor;
//import com.squareup.okhttp.OkHttpClient;
//import com.squareup.okhttp.*;;

//import com.squareup.okhttp.logging.HttpLoggingInterceptor;

//import okhttp3.*;

public class Article_Directory {
	
public	ArrayList<Article> news= new ArrayList<>();

    public ArrayList<Article> getNews() {
        return news;
    }

    public void setNews(ArrayList<Article> news) {
        this.news = news;
    }
  public ArrayList<Article> news_fetch() {
      
//      ArrayList<Article> news_fin= new ArrayList<>();
	  
//	  HttpRequest request = HttpRequest.newBuilder()
//				.uri(URI.create("https://ms-finance.p.rapidapi.com/market/v2/auto-complete?q=amazon"))
//				.header("X-RapidAPI-Key", "7003839037msh36f6df26a42e70dp19c9aajsn8cd72eff0a33")
//				.header("X-RapidAPI-Host", "ms-finance.p.rapidapi.com")
//				.method("GET", HttpRequest.BodyPublishers.noBody())
//				.build();
//		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());
	  
	  try{
              
             
	  HttpRequest request = HttpRequest.newBuilder()
			  .uri(URI.create("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=1047e1b7d1d4419c9d2047b7c880f6f6"))
				.header("apikey", "1047e1b7d1d4419c9d2047b7c880f6f6")
//				.uri(URI.create("https://api.apilayer.com/financelayer/news?tags=Bitcoin%2C%20-money%2C%20-finance%2C%20-stocks%2C%20-Financial%20Market"))
//				.header("apikey", "kvA6P1cQTfgTciggutKHRUsyzx4Yr3h7")
			  
			  
			  
				// 1047e1b7d1d4419c9d2047b7c880f6f6
//				.header("X-RapidAPI-Host", "ms-finance.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//		response.body().split("source");
		ArrayList<String> raw= new ArrayList<>();
		ArrayList<String> raw_title= new ArrayList<>();
		ArrayList<String> raw_desc= new ArrayList<>();
		ArrayList<String> raw_url= new ArrayList<>();
		ArrayList<String> raw_img= new ArrayList<>();
		String ans = response.body();
		Article_Directory t= new Article_Directory();
		String tokens[] = ans.split("source");
		int i=1;
		String temp;
		String val1,val2,val3,val4,val5,val6,val7,val8;
		while(i<10) {
			temp=tokens[i];
			String tokens_title[] = temp.split("title");
			raw.add(temp);
			val1=tokens_title[1];
			String tokens_desc[] = val1.split("description");
			val2=tokens_desc[0];
			val3=tokens_desc[1];
			String tokens_url[] = val3.split("url");
			String tokens_image[] = val3.split("urlToImage");
			val4=tokens_url[0];
			val5=tokens_url[1];
			val6=tokens_image[1];
			String tokens_com[] = val6.split(",");
			val7=tokens_com[0];
			
			String title_;
			String desc_;
			String url_;
			String image_;
			
			raw_title.add(val2.substring(3, val2.length() - 3) );
			raw_desc.add(val4.substring(3, val4.length() - 3));
			raw_url.add(val5.substring(3, val5.length() - 3));
			raw_img.add(val7.substring(3, val7.length() - 1));
			
			title_=val2.substring(3, val2.length() - 3);
			desc_=val4.substring(3, val4.length() - 3);
			url_=val5.substring(3, val5.length() - 3);
			image_=val7.substring(3, val7.length() - 1);
			
			Article art= new Article(title_,desc_,url_,image_);
			
			
			t.news.add(art);
			
			i++;
		}
//		for(int j=0;j<1;j++){
////			raw.forEach(System.out::println);
//			raw_title.forEach(System.out::println);
//			raw_desc.forEach(System.out::println);
//			raw_url.forEach(System.out::println);
//			raw_img.forEach(System.out::println);
//		}
		
		
        StringBuilder sb1 = new StringBuilder("");
        
		
		for(Article a: t.news) {
			
			 sb1.append("\n").append(a).append("\n");
			
			
		}
//                news_fin=news;
        System.out.println(sb1.toString());
		
		
//		System.out.println("\n" + ans);
//		System.out.println(ans.split("source"));
		System.out.println("\n done");
              
              
          }catch(Exception e){
              System.out.println("not working");
            e.printStackTrace();
          }
	  
	  
//	  HttpRequest request = HttpRequest.newBuilder()
//			  .uri(URI.create("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=1047e1b7d1d4419c9d2047b7c880f6f6"))
//				.header("apikey", "1047e1b7d1d4419c9d2047b7c880f6f6")
////				.uri(URI.create("https://api.apilayer.com/financelayer/news?tags=Bitcoin%2C%20-money%2C%20-finance%2C%20-stocks%2C%20-Financial%20Market"))
////				.header("apikey", "kvA6P1cQTfgTciggutKHRUsyzx4Yr3h7")
//			  
//			  
//			  
//				// 1047e1b7d1d4419c9d2047b7c880f6f6
////				.header("X-RapidAPI-Host", "ms-finance.p.rapidapi.com")
//				.method("GET", HttpRequest.BodyPublishers.noBody())
//				.build();
//		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//		response.body().split("source");
//		ArrayList<String> raw= new ArrayList<>();
//		ArrayList<String> raw_title= new ArrayList<>();
//		ArrayList<String> raw_desc= new ArrayList<>();
//		ArrayList<String> raw_url= new ArrayList<>();
//		ArrayList<String> raw_img= new ArrayList<>();
//		String ans = response.body();
//		Article_Directory t= new Article_Directory();
//		String tokens[] = ans.split("source");
//		int i=1;
//		String temp;
//		String val1,val2,val3,val4,val5,val6,val7,val8;
//		while(i<10) {
//			temp=tokens[i];
//			String tokens_title[] = temp.split("title");
//			raw.add(temp);
//			val1=tokens_title[1];
//			String tokens_desc[] = val1.split("description");
//			val2=tokens_desc[0];
//			val3=tokens_desc[1];
//			String tokens_url[] = val3.split("url");
//			String tokens_image[] = val3.split("urlToImage");
//			val4=tokens_url[0];
//			val5=tokens_url[1];
//			val6=tokens_image[1];
//			String tokens_com[] = val6.split(",");
//			val7=tokens_com[0];
//			
//			String title_;
//			String desc_;
//			String url_;
//			String image_;
//			
//			raw_title.add(val2.substring(3, val2.length() - 3) );
//			raw_desc.add(val4.substring(3, val4.length() - 3));
//			raw_url.add(val5.substring(3, val5.length() - 3));
//			raw_img.add(val7.substring(3, val7.length() - 1));
//			
//			title_=val2.substring(3, val2.length() - 3);
//			desc_=val4.substring(3, val4.length() - 3);
//			url_=val5.substring(3, val5.length() - 3);
//			image_=val7.substring(3, val7.length() - 1);
//			
//			Article art= new Article(title_,desc_,url_,image_);
//			
//			
//			t.news.add(art);
//			
//			i++;
//		}
////		for(int j=0;j<1;j++){
//////			raw.forEach(System.out::println);
////			raw_title.forEach(System.out::println);
////			raw_desc.forEach(System.out::println);
////			raw_url.forEach(System.out::println);
////			raw_img.forEach(System.out::println);
////		}
//		
//		
//        StringBuilder sb1 = new StringBuilder("");
//        
//		
//		for(Article a: t.news) {
//			
//			 sb1.append("\n").append(a).append("\n");
//			
//			
//		}
//        System.out.println(sb1.toString());
//		
//		
////		System.out.println("\n" + ans);
////		System.out.println(ans.split("source"));
//		System.out.println("\n done");
//		
//		
//		
		
		
		
	  
//	  OkHttpClient client = new OkHttpClient().newBuilder().build();
////	  OkHttpClient client = new OkHttpClient();
//	    Request request = new Request.Builder()
//	      .url("https://api.apilayer.com/financelayer/news?tickers=tickers&tags=tags&sources=sources&sort=sort&offset=offset&limit=limit&keywords=keywords&fallback=fallback&date=date")
//	      .addHeader("apikey", "kvA6P1cQTfgTciggutKHRUsyzx4Yr3h7")
//	      .method("GET", null)
//	      .build();
////	    OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
////	    OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
////	    OkHttpClient client = new OkHttpClient().newBuilder().build();
//	    
//	    Response response = client.newCall(request).execute();
//	    System.out.println(response.body().string());
	  
	  
//	  NewsApiClient newsApiClient = new NewsApiClient("YOUR_API_KEY");
//
//	// /v2/everything
//	newsApiClient.getEverything(
//	  new EverythingRequest.Builder()
//	          .q("trump")
//	          .build(),
//	  new NewsApiClient.ArticlesResponseCallback() {
//	      @Override
//	      public void onSuccess(ArticleResponse response) {
//	          System.out.println(response.getArticles().get(0).getTitle());
//	      }
//
//	      @Override
//	      public void onFailure(Throwable throwable) {
//	          System.out.println(throwable.getMessage());
//	      }
//	  }
//	  OkHttpClient client = new OkHttpClient();
////    OkHttpClient client = (new OkHttpClient()).newBuilder().build();
//	 // OkHttpClient client = new OkHttpClient();
//
//	  Request request = new Request.Builder()
//	  	.url("https://ms-finance.p.rapidapi.com/market/v2/auto-complete?q=tesla")
//	  	.get()
//	  	.addHeader("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
//	  	.addHeader("X-RapidAPI-Host", "ms-finance.p.rapidapi.com")
//	  	.build();
//
//	  Response response = client.newCall(request).execute();
//	  HttpResponse<String> response = Unirest.get("https://ms-finance.p.rapidapi.com/market/v2/auto-complete?q=tesla")
//				.header("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
//				.header("X-RapidAPI-Host", "ms-finance.p.rapidapi.com")
//				.asString();

//    Request request = new Request.Builder()
//      .url("https://api.apilayer.com/financelayer/news?tickers=tickers&tags=tags&sources=sources&sort=sort&offset=offset&limit=limit&keywords=keywords&fallback=fallback&date=date")
//      .addHeader("apikey", "kvA6P1cQTfgTciggutKHRUsyzx4Yr3h7")
//      .method("GET", })
//      .build();
//    Response response = client.newCall(request).execute();
//    System.out.println(response.body().string());
 return news;
  }
}
