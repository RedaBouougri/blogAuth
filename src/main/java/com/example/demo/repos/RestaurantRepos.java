package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Repas;
import com.example.demo.entity.Restaurant;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;

public interface RestaurantRepos extends JpaRepository<Restaurant, Integer>{
	
	@Query("select r from Repas r where r.restaurant = ?1 ")
	public List<Repas> findByRestaurant(Restaurant restaurant);
	
	@Query("select r from Restaurant r Join r.zone z Join z.ville v where v=?1 and z=?2")
	public List<Restaurant> findByVilleZone(Ville ville, Zone zone);
	
	@Query("SELECT r FROM Restaurant r JOIN r.specialites s WHERE s.nom = ?1")
	public List<Restaurant> findBySpecialite(String specialite);
}
