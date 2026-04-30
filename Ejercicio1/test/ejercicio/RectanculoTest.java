package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanculoTest {

	@Test
	void test() {
		 // --- CASO 1: valores positivos ---
        Rectangulo r1 = new Rectangulo(3, 4);
        assertAll(
            () -> assertEquals(12, r1.area()),
            () -> assertEquals(14, r1.perimetro())
        );

        // --- CASO 2: algún valor negativo ---
        Rectangulo r2 = new Rectangulo(-3, 4);
        assertAll(
            () -> assertEquals(-1, r2.area()),
            () -> assertEquals(-1, r2.perimetro())
        );

        Rectangulo r3 = new Rectangulo(3, -4);
        assertAll(
            () -> assertEquals(-1, r3.area()),
            () -> assertEquals(-1, r3.perimetro())
        );

        Rectangulo r4 = new Rectangulo(-3, -4);
        assertAll(
            () -> assertEquals(-1, r4.area()),
            () -> assertEquals(-1, r4.perimetro())
        );

        // --- CASO 3: algún valor cero ---
        Rectangulo r5 = new Rectangulo(0, 4);
        assertAll(
            () -> assertEquals(0, r5.area()),
            () -> assertEquals(0, r5.perimetro())
        );

        Rectangulo r6 = new Rectangulo(3, 0);
        assertAll(
            () -> assertEquals(0, r6.area()),
            () -> assertEquals(0, r6.perimetro())
        );

        Rectangulo r7 = new Rectangulo(0, 0);
        assertAll(
            () -> assertEquals(0, r7.area()),
            () -> assertEquals(0, r7.perimetro())
        );

        // --- 4. Aserciones erróneas para comprobar fallos ---
        
        assertAll(
            () -> assertEquals(999, r1.area()),       
            () -> assertEquals(-50, r1.perimetro())   
        );
	}

}
