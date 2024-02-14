package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.junit.Test;

public class DeathStarTest {


	@Before
	public void setup() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Write an integration test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetIntegration() {
		// TODO: Fill in!
		DeathStar deathStar = new DeathStar();
		Planet planet = new Planet(10);
		String result = deathStar.shoot(planet);
		String expected = "Wimpy planet was hit by the superlaser!";
		assertEquals(expected, result);
		assertEquals(10-100, planet.getHitPoints());
		
	}

	/**
	 * Write an unit test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetUnit() {
		// TODO: Fill in!
		DeathStar deathStar = new DeathStar();
		Planet mockPlanet= Mockito.mock(Planet.class);
		Mockito.when(mockPlanet.getHitPoints()).thenReturn(10);
		Mockito.when(mockPlanet.toString()).thenReturn("Wimpy planet");

		String result = deathStar.shoot(mockPlanet);
		String expected = "Wimpy planet was hit by the superlaser!";
		assertEquals("Wimpy planet was hit by the superlaser!", result);
		Mockito.verify(mockPlanet).damage(100);


	}
}
