package com.mds.app.testes.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mds.app.model.ParlamentarModel;
import com.mds.app.model.ProjetoModel;

public class ProjetoModelTest {

	private ProjetoModel projetoModel;
	private ParlamentarModel parlamentarModel;

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste...");

		parlamentarModel = new ParlamentarModel();

		projetoModel = new ProjetoModel("2013", "NomeProjeto", "PL", "16/10/2013", "66", "ExplicacaoProjeto",
				parlamentarModel);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando...");
	}

	@Test
	public void testInstance() {
		ProjetoModel testInstanceProjetoModel = new ProjetoModel();
		assertNotNull(testInstanceProjetoModel);
	}

	@Test
	public void testGetNome() {
		assertEquals("NomeProjeto", projetoModel.getNome());
	}

	@Test
	public void testGetAno() {
		assertEquals("2013", projetoModel.getAno());
	}

	@Test
	public void testGetSigla() {
		assertEquals("PL", projetoModel.getSigla());
	}

	@Test
	public void testGetData() {
		assertEquals("16/10/2013", projetoModel.getData());
	}

	@Test
	public void testGetNumero() {
		assertEquals("66", projetoModel.getNumero());
	}

	@Test
	public void testGetExplicacao() {
		assertEquals("ExplicacaoProjeto", projetoModel.getExplicacao());
	}

	@Test
	public void testGetParlamentar() {
		// ParlamentarModel outroParlamentar = new ParlamentarModel();
		assertEquals(parlamentarModel, projetoModel.getParlamentar());
	}

	@Test
	public void testGetContEqualsOne() {
		assertEquals(1, projetoModel.getCont());
	}

	@Test
	public void testGetContGreaterThanOne() {
		projetoModel.setNome("TesteCont");
		assertEquals(2, projetoModel.getCont());
	}

	@Test
	public void testSetNome() {
		projetoModel.setNome("SetNomeProjeto");
		assertEquals("SetNomeProjeto", projetoModel.getNome());
	}

	@Test
	public void testSetAno() {
		projetoModel.setAno("2012");
		assertEquals("2012", projetoModel.getAno());
	}

	@Test
	public void testSetSigla() {
		projetoModel.setSigla("PDS");
		assertEquals("PDS", projetoModel.getSigla());
	}

	@Test
	public void testSetData() {
		projetoModel.setData("15/10/2013");
		assertEquals("15/10/2013", projetoModel.getData());
	}

	@Test
	public void testSetNumero() {
		projetoModel.setNumero("67");
		assertEquals("67", projetoModel.getNumero());
	}

	@Test
	public void testSetExplicacao() {
		projetoModel.setExplicacao("SetExplicacaoProjeto");
		assertEquals("SetExplicacaoProjeto", projetoModel.getExplicacao());
	}

	@Test
	public void testSetParlamentar() {
		ParlamentarModel outroParlamentar = new ParlamentarModel();
		projetoModel.setParlamentar(outroParlamentar);
		assertEquals(outroParlamentar, projetoModel.getParlamentar());
	}

}
