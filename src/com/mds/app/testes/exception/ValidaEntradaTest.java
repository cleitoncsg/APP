package com.mds.app.testes.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mds.app.exception.ValidaEntrada;

public class ValidaEntradaTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando...");
	}

	@Test
	public void testValidaDataVazia() {
		assertEquals(true, ValidaEntrada.validaData(""));
	}

	@Test
	public void testValidaData() {
		assertEquals(true, ValidaEntrada.validaData("16/04/2013"));
	}

	@Test
	public void testValidaAutorVazio() {
		assertEquals(true, ValidaEntrada.validaAutor(""));
	}

	@Test
	public void testValidaAutor() {
		assertEquals(true, ValidaEntrada.validaAutor("NomeDoAutor"));
	}

	@Test
	public void testValidaNumeroVazio() {
		assertEquals(true, ValidaEntrada.validaNumero(""));
	}

	@Test
	public void testValidaNumero() {
		assertEquals(true, ValidaEntrada.validaNumero("1234"));
	}

	@Test
	public void testValidaAno() {
		assertEquals(true, ValidaEntrada.validaAno("2013"));
	}

	@Test
	public void testValidaSigla() {
		assertEquals(true, ValidaEntrada.validaSigla("PL"));
	}

	@Test
	public void testValidaUfVazia() {
		assertEquals(true, ValidaEntrada.validaUf(""));
	}

	@Test
	public void testValidaUf() {
		assertEquals(false, ValidaEntrada.validaUf("abc"));
	}

	@Test
	public void testValidandoEntradas() {
		boolean resultadoEsperado[] = { true, true, true, true, true, true, true };
		boolean retornoDoMetodo[] = ValidaEntrada.validandoEntradas("asd1 d12e ", "asd 1d12e ", "asd 1d12e ",
				"asd 1d12e ", "asd1d 12e ", "asd 1d12e ", "asd 1d12e ");
		boolean teste = Arrays.equals(resultadoEsperado, retornoDoMetodo);
		assertTrue(teste);
	}

	@Test
	public void testIdentificarErros() {
		String todosErradosEsperado = " Ano invalido  Sigla Invalida  Numero invalido  Data inicial invalida  Autor invalido  Partido invalido  UF invalida ";
		String retornoDoMetodo = ValidaEntrada.identificarErros("asd1 d12e ", "asd 1d12e ", "asd 1d12e ",
				"asd 1d12e ", "asd1d 12e ", "asd 1d12e ", "asd 1d12e ");
		assertEquals(todosErradosEsperado, retornoDoMetodo);
	}

}