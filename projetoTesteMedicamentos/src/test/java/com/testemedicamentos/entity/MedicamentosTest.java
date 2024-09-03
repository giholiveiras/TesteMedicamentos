package com.testemedicamentos.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentosTest {

	private Medicamentos medicamentos;

	@BeforeEach
	void setUp() {
		// Arrange
		medicamentos = new Medicamentos(1L, "Rivotril", "ansiolítico", "19/07");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		medicamentos.setId(2L);
		// Assert
		assertEquals(2L, medicamentos.getId());

	}

	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		// Act
		medicamentos.setNome("Allegra");
		// Assert
		assertEquals("Allegra", medicamentos.getNome());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		// Act
		medicamentos.setBula("54321");
		// Assert
		assertEquals("54321", medicamentos.getBula());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo data de validade")
	void testDataValidade() {
		// Act
		medicamentos.setDataValidade("20/08");
		// Assert
		assertEquals("20/08", medicamentos.getDataValidade());
	}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos\"")
	void testConstructorAll() {
		// Act
		Medicamentos novoMedicamento = new Medicamentos(3L, "Anador", "dipirona", "22/04");
		// Assertion
		assertAll("novohospede", () -> assertEquals(3L, novoMedicamento.getId()),
				() -> assertEquals("Anador", novoMedicamento.getNome()),
				() -> assertEquals("dipirona.com", novoMedicamento.getBula()),
				() -> assertEquals("22/04", novoMedicamento.getDataValidade()));
	}
}
