package com.company.biometric;

import java.util.concurrent.Callable;

interface Reptile {
    ReptileEgg lay();
}

public class FireDragon implements Reptile {
    public FireDragon() {
    }

    public static void main(String[] args) throws Exception {
        FireDragon fireDragon = new FireDragon();
        System.out.println(fireDragon instanceof Reptile);
        ReptileEgg reptileEgg = fireDragon.lay();
        Reptile newReptile = reptileEgg.hatch();
        reptileEgg.hatch();
    }

    @Override
    public ReptileEgg lay() {
        return new ReptileEgg(FireDragon::new);
    }
}

class ReptileEgg {
    private int count = 0;
    private Callable<Reptile> reptile;

    public ReptileEgg(Callable<Reptile> createReptile) {
        this.reptile = createReptile;
    }

    public Reptile hatch() throws Exception {
        if (count > 0) {
            throw new IllegalStateException("Reptile already hatched!");
        }
        count++;
        return reptile.call();
    }
}
