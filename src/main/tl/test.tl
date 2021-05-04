package BestPackageEver;

int function(float a, float b, float c)
start
    int first = 7 + 5;
    first += 3;

	return (a + (b + c));
finish

int tesIf(int index)
start
	if(index > 10)
    then
        start
            print(111);
        finish
    else
        start
            print(112);
            return -1;
        finish

	int d = function(index, 100, 20);

	return d;
finish


main
    start
        float a = (float) 5.4;
        for (int i = 0; i < 10; i+=1)
        start
            int r = 10;
            print(r);
            print(test(i));

            print(i);

        finish
    finish