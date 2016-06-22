package main;

import ws.travel.car.BookCarService;
import ws.travel.hotel.BookHotelService;
import ws.travel.spot.SpotGuideService;
import ws.travel.ticket.BookTicketService;

public class main {

	public static void main(String[] args) {
		BookCarService carService = new BookCarService();
		String result = carService.bookCar("SUV", true, "shanghai", "suzhou");
		System.out.println(result);

		BookHotelService hotelService = new BookHotelService();
		result = hotelService.bookHotel("2016-06-10", "shanghai");
		System.out.println(result);

		SpotGuideService spotGuideService = new SpotGuideService();
		result = spotGuideService.spotGuide("dongfangmingzhu", true);
		System.out.println(result);

		BookTicketService bookTicketService = new BookTicketService();
		result = bookTicketService.bookTicket("2016-06-10", "beijing", "shanghai");
		System.out.println(result);
	}
}
