package com.ex.dao;

import java.util.ArrayList;
import java.util.List;

import com.ex.pojos.Artist;

public interface DAO {
	public ArrayList<Artist> getArtists();
	public Artist getArtistById(int id);
	public Artist addArtist(String name);
	public Artist updateArtist(int id, String name);
	public Artist getNameById(int id);
	public List<Artist> getArtistsStoredProc();
}
