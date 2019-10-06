package data;

import exceptions.OutOfRangeException;

public class GroupFactory extends FactoryBase{
	public GroupInterface getNewGroup(){
		return new Group();
	}
	public GroupInterface getFakeGroup()  {
		FakeGroup fakeGroup = new FakeGroup();
		try {
			fakeGroup.setName(faker.name().name());
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		try {
			fakeGroup.setYear(faker.number().numberBetween(Group.minYear, Group.maxYear));
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		return fakeGroup;
	}
}
