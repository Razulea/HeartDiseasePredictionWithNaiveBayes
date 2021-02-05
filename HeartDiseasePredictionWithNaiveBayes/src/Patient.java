public class Patient {

    int id = 0;

    String patient_name;

    //0 = low: <120 mmHg, 1 = prehypertension: 120 to <140 mmHg, 2 = stage 1 hypertension: 140 to <160 mmHg and
    // 3 = stage 2 hypertension: ≥160 mmHg
    int blood_pressure;

    //0 = low: <130 mg/dL, 1 = moderate: 130 to <160 mg/dL, 2 = high 160 to <190 mg/dL, 3 = and very high: ≥190 mg/dL
    int ldl_cholesterol;

    //0 = normal, 1 = low, 2 = nonexistent
    int daily_movement;

    //0 = not obese, 1 = obese
    int obesity;

    //0 = no smoking, 1 = moderate smoking, 2 = heavy smoking
    int smoking;

    // 0 = normal, 1 = low, 2 = very low
    int sleep;

    // 0 = mostly healthy, 1 = irregular, 2 = bad
    int nutrition;

    //0 = healthy, 1 = has HD
    int heart_disease;

    public Patient(String patient_name, int blood_pressure, int ldl_cholesterol, int daily_movement, int obesity, int smoking, int sleep, int nutrition, int heart_disease) {
        this.id++;
        this.patient_name = patient_name;
        this.blood_pressure = blood_pressure;
        this.ldl_cholesterol = ldl_cholesterol;
        this.daily_movement = daily_movement;
        this.obesity = obesity;
        this.smoking = smoking;
        this.sleep = sleep;
        this.nutrition = nutrition;
        this.heart_disease = heart_disease;
    }

    public int getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public int getLdl_cholesterol() {
        return ldl_cholesterol;
    }

    public void setLdl_cholesterol(int ldl_cholesterol) {
        this.ldl_cholesterol = ldl_cholesterol;
    }

    public int getDaily_movement() {
        return daily_movement;
    }
    public int getObesity() {
        return obesity;
    }

    public void setObesity(int obesity) {
        this.obesity = obesity;
    }

    public int getSmoking() {
        return smoking;
    }

    public int getSleep() {
        return sleep;
    }
    public int getNutrition() {
        return nutrition;
    }
    public int getHeart_disease() {
        return heart_disease;
    }

    public void setHeart_disease(int heart_disease) {
        this.heart_disease = heart_disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_name='" + patient_name + '\'' +
                ", blood_pressure=" + blood_pressure +
                ", ldl_cholesterol=" + ldl_cholesterol +
                ", daily_movement=" + daily_movement +
                ", obesity=" + obesity +
                ", smoking=" + smoking +
                ", sleep=" + sleep +
                ", nutrition=" + nutrition +
                ", heart_disease=" + heart_disease +
                '}';
    }
}
