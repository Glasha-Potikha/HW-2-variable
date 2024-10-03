public class Main {
    public static void main(String[] args) {
        //задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача №3
        dog -= 3.5;
        cat = cat - 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        //задача №4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        //задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


        //задача №6
       var firstBoxer = 78.2;
       var secondBoxer = 82.7;
       var res1 = firstBoxer + secondBoxer;
        System.out.println(res1);
        //чтобы разница был положительной, будем вычитать из большего меньшее
       if (firstBoxer > secondBoxer) {
           var res2 = firstBoxer - secondBoxer;
           System.out.println(res2);
       } else {
           var res2 = secondBoxer - firstBoxer;
           System.out.println(res2);
       }


        //задача №7
        if (firstBoxer > secondBoxer) {
            var res3 = firstBoxer % secondBoxer;
            System.out.println(res3);
        } else {
            var res3 = secondBoxer % firstBoxer;
            System.out.println(res3);
        }


        //задача №8.1
       var totalHours = 640;
       var hoursPerWorker = 8;
       var workers = totalHours / hoursPerWorker;
        System.out.println("Всего работников в компании — " + workers + " человек");

        //задача №8.2
        workers += 94;
        totalHours = workers * hoursPerWorker;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}