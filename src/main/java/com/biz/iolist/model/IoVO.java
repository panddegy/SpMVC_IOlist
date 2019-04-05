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
public class IoVO {
/*
	IO_ID     NOT NULL VARCHAR2(4)   
	IO_DATE   NOT NULL VARCHAR2(10)  
	IO_PNAME  NOT NULL NVARCHAR2(50) 
	IO_INOUT           NVARCHAR2(10) 
	IO_QUAN            NUMBER        
	IO_PRICE           NUMBER        
	IO_TOTAL           NUMBER        
	IO_D_CODE          VARCHAR2(6)   
*/
	private String io_id, io_date, io_inout;
	private int io_quan, io_price, io_total;
	private String io_d_code, io_p_code;
	
}
