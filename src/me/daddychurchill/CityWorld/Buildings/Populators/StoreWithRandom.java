package me.daddychurchill.CityWorld.Buildings.Populators;

import org.bukkit.Material;

import me.daddychurchill.CityWorld.Buildings.Rooms.EmptyRoom;
import me.daddychurchill.CityWorld.Buildings.Rooms.RegisterRoom;
import me.daddychurchill.CityWorld.Buildings.Rooms.StorageDoubleShelvesRoom;
import me.daddychurchill.CityWorld.Buildings.Rooms.StorageSingleRowRoom;
import me.daddychurchill.CityWorld.Plugins.RoomProvider;

public class StoreWithRandom extends RoomProvider {

	public StoreWithRandom() {
		super();
		
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageDoubleShelvesRoom());
		roomTypes.add(new StorageSingleRowRoom(Material.BOOKSHELF));
		roomTypes.add(new StorageSingleRowRoom(Material.BOOKSHELF));
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new EmptyRoom());
		roomTypes.add(new RegisterRoom());
	}

}
