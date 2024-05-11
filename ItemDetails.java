package bhanu.prakash.entity;

import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
//@Table(name = "Cargo_Details")
public class ItemDetails {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Nonnull
	private Integer Lrnumber;
	private String Transport_plan;
	private Double Transport_charges;
	private String Terimination_description;
	private String Status;
	private String Item_description;
	private String Sendername;
	private String From_add;
	private LocalDate From_date;
	private String Receivername;
	private LocalDate Receive_date;
	private String To_add;
	private LocalDate To_date;
	//
	public Number getLrnumber() {
		return Lrnumber;
	}
	public void setLrnumber(Number lrnumber) {
		Lrnumber = (Integer) lrnumber;
	}
	public String getTransport_plan() {
		return Transport_plan;
	}
	public void setTransport_plan(String transport_plan) {
		Transport_plan = transport_plan;
	}
	public Double getTransport_charges() {
		return Transport_charges;
	}
	public void setTransport_charges(Double transport_charges) {
		Transport_charges = transport_charges;
	}
	public String getTerimination_description() {
		return Terimination_description;
	}
	public void setTerimination_description(String terimination_description) {
		Terimination_description = terimination_description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getItem_description() {
		return Item_description;
	}
	public void setItem_description(String item_description) {
		Item_description = item_description;
	}
	public String getSendername() {
		return Sendername;
	}
	public void setSendername(String sendername) {
		Sendername = sendername;
	}
	public String getFrom_add() {
		return From_add;
	}
	public void setFrom_add(String from_add) {
		From_add = from_add;
	}
	public LocalDate getFrom_date() {
		return From_date;
	}
	public void setFrom_date(LocalDate from_date) {
		From_date = from_date;
	}
	public String getReceivername() {
		return Receivername;
	}
	public void setReceivername(String receivername) {
		Receivername = receivername;
	}
	public LocalDate getReceive_date() {
		return Receive_date;
	}
	public void setReceive_date(LocalDate receive_date) {
		Receive_date = receive_date;
	}
	public String getTo_add() {
		return To_add;
	}
	public void setTo_add(String to_add) {
		To_add = to_add;
	}
	public LocalDate getTo_date() {
		return To_date;
	}
	public void setTo_date(LocalDate to_date) {
		To_date = to_date;
	}
	public ItemDetails(Number lrnumber, String transport_plan, Double transport_charges,
			String terimination_description, String status, String item_description, String sendername, String from_add,
			LocalDate from_date, String receivername, LocalDate receive_date, String to_add, LocalDate to_date) {
		super();
		Lrnumber = (Integer) lrnumber;
		Transport_plan = transport_plan;
		Transport_charges = transport_charges;
		Terimination_description = terimination_description;
		Status = status;
		Item_description = item_description;
		Sendername = sendername;
		From_add = from_add;
		From_date = from_date;
		Receivername = receivername;
		Receive_date = receive_date;
		To_add = to_add;
		To_date = to_date;
	}
	public ItemDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ItemDetails [Lrnumber=" + Lrnumber + ", Transport_plan=" + Transport_plan + ", Transport_charges="
				+ Transport_charges + ", Terimination_description=" + Terimination_description + ", Status=" + Status
				+ ", Item_description=" + Item_description + ", Sendername=" + Sendername + ", From_add=" + From_add
				+ ", From_date=" + From_date + ", Receivername=" + Receivername + ", Receive_date=" + Receive_date
				+ ", To_add=" + To_add + ", To_date=" + To_date + "]";
	}
	
	
	//
	
	
	
}
