package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanculoTest {

	@Test
	void test() {
		 // --- CASO 1: valores positivos ---
        Rectangle r1 = new Rectangle(3, 4);
        assertAll(
            () -> assertEquals(12, r1.surface()),
            () -> assertEquals(14, r1.perimeter())
        );

        // --- CASO 2: algún valor negativo ---
        Rectangle r2 = new Rectangle(-3, 4);
        assertAll(
            () -> assertEquals(-1, r2.surface()),
            () -> assertEquals(-1, r2.perimeter())
        );

        Rectangle r3 = new Rectangle(3, -4);
        assertAll(
            () -> assertEquals(-1, r3.surface()),
            () -> assertEquals(-1, r3.perimeter())
        );

        Rectangle r4 = new Rectangle(-3, -4);
        assertAll(
            () -> assertEquals(-1, r4.surface()),
            () -> assertEquals(-1, r4.perimeter())
        );

        // --- CASO 3: algún valor cero ---
        Rectangle r5 = new Rectangle(0, 4);
        assertAll(
            () -> assertEquals(0, r5.surface()),
            () -> assertEquals(0, r5.perimeter())
        );

        Rectangle r6 = new Rectangle(3, 0);
        assertAll(
            () -> assertEquals(0, r6.surface()),
            () -> assertEquals(0, r6.perimeter())
        );

        Rectangle r7 = new Rectangle(0, 0);
        assertAll(
            () -> assertEquals(0, r7.surface()),
            () -> assertEquals(0, r7.perimeter())
        );

        // --- 4. Aserciones erróneas para comprobar fallos ---
        
        assertAll(
            () -> assertEquals(999, r1.surface()),       
            () -> assertEquals(-50, r1.perimeter())   
        );
	}

}
