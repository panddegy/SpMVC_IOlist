package com.biz.iolist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IoDTO {
	
	private String io_id, io_date, io_inout;
	private int io_quan, io_price, io_total;
	private String io_d_code, io_p_code;
	private String d_code, d_name, d_ceo;
	private String p_code, p_name;

}
