package ant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void same_currency_n_amount_is_equal() {
		Money m1 = new Money(12, "SGD");
		Money m2 = new Money(12, "SGD");
		assertEquals(m1.getAmount() + " and " + m2.getAmount() + " aren't equals", m1, m2);
	}

	@Test
	public void adding_same_currency_return_amount_added_up() {
		Money m1 = new Money(12, "SGD");
		Money m2 = new Money(14, "SGD");
		Money sum = m1.add(m2);
		assertEquals(m1.getAmount() + " and " + m2.getAmount() + " don't add up to 26", new Money(26, "SGD"), sum);
	}
}