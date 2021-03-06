package com.mds.app.testes.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mds.app.controller.ProcuraPartidoController;
import com.mds.app.model.ProcuraPartidoModel;

public class ProcuraPartidoControllerTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Comecando o teste...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando...");
	}

	@Test
	public void testInstance() {
		ProcuraPartidoController procuraPartidoController = new ProcuraPartidoController();
		assertNotNull(procuraPartidoController);
	}

	@Test
	public void testAtualizaDadosPesquisaPartido_UF() {
		ProcuraPartidoController.atualizaDadosPesquisaPartido("DF", "PMDB");
		assertEquals("DF", ProcuraPartidoModel.getUf());
	}

	@Test
	public void testAtualizaDadosPesquisaPartido_Sigla() {
		ProcuraPartidoController.atualizaDadosPesquisaPartido("DF", "PMDB");
		assertEquals("PMDB", ProcuraPartidoModel.getSigla());
	}
}
