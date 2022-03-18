package onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class BillingDetails {
	@Id
	private String account_number;
    private String bill_type;
	private String operator;
    private float bill_amount;
}