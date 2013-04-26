package me.daddychurchill.CityWorld.Buildings;

import me.daddychurchill.CityWorld.WorldGenerator;
import me.daddychurchill.CityWorld.Buildings.Populators.EmptyWithRooms;
import me.daddychurchill.CityWorld.Maps.PlatMap;
import me.daddychurchill.CityWorld.Plats.PlatLot;
import me.daddychurchill.CityWorld.Plugins.RoomProvider;

public class EmptyBuildingLot extends LibraryBuildingLot {

	private static RoomProvider contentsRooms = new EmptyWithRooms();

	public EmptyBuildingLot(PlatMap platmap, int chunkX, int chunkZ) {
		super(platmap, chunkX, chunkZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RoomProvider roomProviderForFloor(WorldGenerator generator, int floor) {
		return contentsRooms;
	}
	
	@Override
	protected InteriorStyle getFloorsInteriorStyle(int floor) {
		int range = height / 4;
		if (floor < range)
			return InteriorStyle.WALLS_OFFICES;
		else if (floor < range * 2)
			return InteriorStyle.WALLS_ONLY;
		else if (floor < range * 3)
			return InteriorStyle.COLUMNS_OFFICES;
		else 
			return InteriorStyle.COLUMNS_ONLY;
	}
	
	@Override
	public PlatLot newLike(PlatMap platmap, int chunkX, int chunkZ) {
		return new EmptyBuildingLot(platmap, chunkX, chunkZ);
	}
}
