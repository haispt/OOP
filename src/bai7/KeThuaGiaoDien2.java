package bai7;

interface TheAnimal {
	void makeSound();
}

interface prettyAnimal{
	void takeCare();
}

//Một giao diện kế thừa từ nhiều giao diện khác
interface Pet extends TheAnimal, prettyAnimal {
	void goPlay();
}
