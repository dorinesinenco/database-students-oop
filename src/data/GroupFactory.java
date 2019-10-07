package data;

import exceptions.OutOfRangeException;

public class GroupFactory extends FactoryBase {
	public GroupInterface getNewGroup() {	
		return new Group();
	}
	
	public GroupInterface getFakeGroup() throws OutOfRangeException {
		FakeGroup fakeGroup = new FakeGroup();
		fakeGroup.setName(faker.name().name());
		fakeGroup.setYear(faker.number().numberBetween(1, 7));
		
		return fakeGroup;
	}
}
