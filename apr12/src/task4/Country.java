package task4;

import java.util.Objects;

public class Country {
 private String name;
 
 

public Country(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public int hashCode() {
	return Objects.hash(name);
}


public boolean equals(Country obj) {
	return this.name.equalsIgnoreCase(obj.getName());
}

@Override
public String toString() {
	return name;
}

 
}
