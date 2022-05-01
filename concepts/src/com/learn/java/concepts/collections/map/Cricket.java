package com.learn.java.concepts.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cricket {
    public static void main(String[] args) {
        Map<CricketTeam, Integer> map = new HashMap<>();
        map.put(new CricketTeam("New Zealand"), 1);
        map.put(new CricketTeam("England"), 2);
        map.put(new CricketTeam("Australia"), 3);
        map.put(new CricketTeam("India"), 4);

        System.out.println(map.get(new CricketTeam("Australia")));
        System.out.println(map.get(new CricketTeam("India")));
    }

    static class CricketTeam {
        private String name;

        public CricketTeam(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof CricketTeam that)) return false;
            return getName().equals(that.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName());
        }
    }
}
