import java.util.*;

public class main {
    public static void main(String[] args) {

        List<Patient> test_patients = new ArrayList<>();
        generate_patients(test_patients);
        int hd = 0;
        int blood_pressure0 = 0;
        int blood_pressure1 = 0;
        int blood_pressure2 = 0;
        int blood_pressure3 = 0;
        int chol0 = 0;
        int chol1 = 0;
        int chol2 = 0;
        int chol3 = 0;
        int sport0 = 0;
        int sport1 = 0;
        int sport2 = 0;
        int obesity0 = 0;
        int obesity1 = 0;
        int smoking0 = 0;
        int smoking1 = 0;
        int smoking2 = 0;
        int sleep0 = 0;
        int sleep1 = 0;
        int sleep2 = 0;
        int nutrition0 = 0;
        int nutrition1 = 0;
        int nutrition2 = 0;
        int blood_pressure0hd = 0;
        int blood_pressure1hd = 0;
        int blood_pressure2hd = 0;
        int blood_pressure3hd = 0;
        int chol0hd = 0;
        int chol1hd = 0;
        int chol2hd = 0;
        int chol3hd = 0;
        int sport0hd = 0;
        int sport1hd = 0;
        int sport2hd = 0;
        int obesity0hd = 0;
        int obesity1hd = 0;
        int smoking0hd = 0;
        int smoking1hd = 0;
        int smoking2hd = 0;
        int sleep0hd = 0;
        int sleep1hd = 0;
        int sleep2hd = 0;
        int nutrition0hd = 0;
        int nutrition1hd = 0;
        int nutrition2hd = 0;
        for(Patient patient: test_patients) {
            System.out.println(patient);
            if(patient.getHeart_disease() == 1) {
                switch (patient.getSmoking()) {
                    case 0:
                        smoking0hd++;
                        break;
                    case 1:
                        smoking1hd++;
                        break;
                    case 2:
                        smoking2hd++;
                }
                switch (patient.getSleep()) {
                    case 0:
                        sleep0hd++;
                        break;
                    case 1:
                        sleep1hd++;
                        break;
                    case 2:
                        sleep2hd++;
                }
                switch (patient.getObesity()) {
                    case 0:
                        obesity0hd++;
                        break;
                    case 1:
                        obesity1hd++;
                }
                switch (patient.getNutrition()) {
                    case 0:
                        nutrition0hd++;
                        break;
                    case 1:
                        nutrition1hd++;
                        break;
                    case 2:
                        nutrition2hd++;
                }
                switch (patient.getBlood_pressure()) {
                    case 0:
                        blood_pressure0hd++;
                        break;
                    case 1:
                        blood_pressure1hd++;
                        break;
                    case 2:
                        blood_pressure2hd++;
                        break;
                    case 3:
                        blood_pressure3hd++;
                }
                switch (patient.getLdl_cholesterol()) {
                    case 0:
                        chol0hd++;
                        break;
                    case 1:
                        chol1hd++;
                        break;
                    case 2:
                        chol2hd++;
                        break;
                    case 3:
                        chol3hd++;
                }
                switch (patient.getDaily_movement()) {
                    case 0:
                        sport0hd++;
                        break;
                    case 1:
                        sport1hd++;
                        break;
                    case 2:
                        sport2hd++;
                }
            }
            else {
                switch (patient.getSmoking()) {
                    case 0:
                        smoking0++;
                        break;
                    case 1:
                        smoking1++;
                        break;
                    case 2:
                        smoking2++;
                }
                switch (patient.getSleep()) {
                    case 0:
                        sleep0++;
                        break;
                    case 1:
                        sleep1++;
                        break;
                    case 2:
                        sleep2++;
                }
                switch (patient.getObesity()) {
                    case 0:
                        obesity0++;
                        break;
                    case 1:
                        obesity1++;
                }
                switch (patient.getNutrition()) {
                    case 0:
                        nutrition0++;
                        break;
                    case 1:
                        nutrition1++;
                        break;
                    case 2:
                        nutrition2++;
                }
                switch (patient.getBlood_pressure()) {
                    case 0:
                        blood_pressure0++;
                        break;
                    case 1:
                        blood_pressure1++;
                        break;
                    case 2:
                        blood_pressure2++;
                        break;
                    case 3:
                        blood_pressure3++;
                }
                switch (patient.getLdl_cholesterol()) {
                    case 0:
                        chol0++;
                        break;
                    case 1:
                        chol1++;
                        break;
                    case 2:
                        chol2++;
                        break;
                    case 3:
                        chol3++;
                }
                switch (patient.getDaily_movement()) {
                    case 0:
                        sport0++;
                        break;
                    case 1:
                        sport1++;
                        break;
                    case 2:
                        sport2++;
                }
            }
            hd = hd + patient.getHeart_disease();
            }
        int not_hd = 500 - hd;
        float hd_chance = (float) hd/500;
        float not_hd_chance = (float) not_hd/500;
        List<Patient> patients = new ArrayList<>();
        generate_patients(patients);

        int TP = 0;
        int FP = 0;
        int TN = 0;
        int FN = 0;

        for(Patient patient: patients) {
            float chance = hd_chance;
            float chance_not = not_hd_chance;
            switch (patient.getSmoking()) {
                case 0:
                    chance = chance * (float) smoking0hd/hd;
                    chance_not = chance_not * (float) smoking0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) smoking1hd/hd;
                    chance_not = chance_not * (float) smoking1/not_hd;
                    break;
                case 2:
                    chance = chance * (float) smoking2hd/hd;
                    chance_not = chance_not * (float) smoking2/not_hd;
            }
            switch (patient.getSleep()) {
                case 0:
                    chance = chance * (float) sleep0hd/hd;
                    chance_not = chance_not * (float) sleep0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) sleep1hd/hd;
                    chance_not = chance_not * (float) sleep1/not_hd;
                    break;
                case 2:
                    chance = chance * (float) sleep2hd/hd;
                    chance_not = chance_not * (float) sleep2/not_hd;
            }
            switch (patient.getObesity()) {
                case 0:
                    chance = chance * (float) obesity0hd/hd;
                    chance_not = chance_not * (float) obesity0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) obesity1hd/hd;
                    chance_not = chance_not * (float) obesity1/not_hd;
            }
            switch (patient.getNutrition()) {
                case 0:
                    chance = chance * (float) nutrition0hd/hd;
                    chance_not = chance_not * (float) nutrition0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) nutrition1hd/hd;
                    chance_not = chance_not * (float) nutrition1/not_hd;
                    break;
                case 2:
                    chance = chance * (float) nutrition2hd/hd;
                    chance_not = chance_not * (float) nutrition2/not_hd;
            }
            switch (patient.getBlood_pressure()) {
                case 0:
                    chance = chance * (float) blood_pressure0hd/hd;
                    chance_not = chance_not * (float) blood_pressure0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) blood_pressure1hd/hd;
                    chance_not = chance_not * (float) blood_pressure1/not_hd;
                    break;
                case 2:
                    chance = chance * (float) blood_pressure2hd/hd;
                    chance_not = chance_not * (float) blood_pressure2/not_hd;
                    break;
                case 3:
                    chance = chance * (float) blood_pressure3hd/hd;
                    chance_not = chance_not * (float) blood_pressure3/not_hd;
            }
            switch (patient.getLdl_cholesterol()) {
                case 0:
                    chance = chance * (float) chol0hd/hd;
                    chance_not = chance_not * (float) chol0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) chol1hd/hd;
                    chance_not = chance_not * (float) chol1/not_hd;
                    break;
                case 2:
                    chance = chance * (float) chol2hd/hd;
                    chance_not = chance_not * (float) chol2/not_hd;
                    break;
                case 3:
                    chance = chance * (float) chol3hd/hd;
                    chance_not = chance_not * (float) chol3/not_hd;
            }
            switch (patient.getDaily_movement()) {
                case 0:
                    chance = chance * (float) sport0hd/hd;
                    chance_not = chance_not * (float) sport0/not_hd;
                    break;
                case 1:
                    chance = chance * (float) sport1hd/hd;
                    chance_not = chance_not * (float) sport1/not_hd;
                    break;
                case 2:
                    chance = chance * (float) sport2hd/hd;
                    chance_not = chance_not * (float) sport2/not_hd;
            }


            if(chance > chance_not)
                if(patient.getHeart_disease()==1) TP++;
                else FP++;
            else if(patient.getHeart_disease()==1) FN++;
            else TN++;
        }

        System.out.println(TP + " " + FP);
        System.out.println(TN + " " + FN);

        }

    public static void generate_patients(List<Patient> patient_list) {
        Random generator = new Random();
        List<String> names = Arrays.asList("Lisa", "Pop", "Bogdan", "Mihai", "Adrian", "Vasile", "Mara", "Roxana", "Anca", "Maria", "Bianca", "Anca", "Karina", "Iulian", "Iulia", "Marcus", "April", "Ron");
        for(int i = 0; i<=500; i++) {
            Patient patient = new Patient(names.get(generator.nextInt(names.size()))+ " " + names.get(generator.nextInt(names.size())), generator.nextInt(4), generator.nextInt(4), generator.nextInt(3), 0, generator.nextInt(3), generator.nextInt(3), generator.nextInt(3), 0);
            int randomObese = generator.nextInt(100);
            if(randomObese < 30) {
                patient.setObesity(1);
            }
            if(patient.getBlood_pressure() + patient.getLdl_cholesterol() >= 5)
                patient.setHeart_disease(1);
            else if(patient.getBlood_pressure() + patient.getLdl_cholesterol() == 4) {
                int randomInt = generator.nextInt(100);
                if(randomInt < 79) {
                    patient.setHeart_disease(1);
                }
            }
            else if(patient.getObesity() == 1) {
                if(patient.getBlood_pressure() == 0)
                    patient.setBlood_pressure(1);
                if(patient.getLdl_cholesterol() == 0)
                    patient.setLdl_cholesterol(1);
                int randomInt = generator.nextInt(100);
                if(randomInt < 60) {
                    patient.setHeart_disease(1);
                }
            }
            else {
                int sum = patient.getBlood_pressure() + patient.getLdl_cholesterol() + patient.getNutrition() + patient.getSleep() +patient.getSmoking() + patient.getDaily_movement();
                if(sum > 9) {
                    int randomInt = generator.nextInt(100);
                    if(randomInt < 80) {
                        patient.setHeart_disease(1);
                    }
                }
                else if (sum > 6) {
                    int randomInt = generator.nextInt(100);
                    if(randomInt < 40) {
                        patient.setHeart_disease(1);
                    }
                }
            }
            patient_list.add(patient);
        }

    }


}
