package com.example.httptest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class GetMethodEx {
	
	public String getInternetData() throws Exception{
		
		BufferedReader in = null;
		String data = null;
		try{
			HttpClient client = new DefaultHttpClient();
			URI website = new URI("http://www.camara.gov.br/SitCamaraWS/Proposicoes.asmx/ListarProposicoes?sigla=PL&numero=&ano=2011&datApresentacaoIni=14/11/2011&datApresentacaoFim=16/11/2011&autor=&parteNomeAutor=&siglaPartidoAutor=&siglaUFAutor=&generoAutor=&codEstado=&codOrgaoEstado=&emTramitacao=");
			HttpGet request = new HttpGet();
			request.setURI(website);
			HttpResponse response = client.execute(request);
			in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer sb = new StringBuffer("");
			String l = "";
			String nl = System.getProperty("line.separetor");
			while((l = in.readLine()) != null){
				sb.append(l + nl);
			}
				in.close();
				data = sb.toString();
			return data;
		}
		finally{
			if(in != null){
			try{
				in.close();
				return data;
			}
			catch(Exception e){
				System.out.println("fodeu");
			}
		}
		}
	}
	
}