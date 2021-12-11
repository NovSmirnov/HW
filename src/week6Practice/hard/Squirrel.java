package week6Practice.hard;

public class Squirrel {
    private int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
        if (index < nuts.length && index >= 0) {
            return nuts[index];
        }
        return 0;
    }

    public int maxNuts() {
        int maxnuts = 0;
        int penNo = -1;
        while (penNo < this.nuts.length) {
            if (penNo + 2 < this.nuts.length) {
                if ((nuts[penNo + 1] >= 0 && nuts[penNo + 2] >= 0) || (nuts[penNo + 1] >= 0 && nuts[penNo + 2] < 0)) {
                    penNo++;
                    maxnuts += getNuts(penNo);
                } else if (nuts[penNo + 1] < 0 && nuts[penNo + 2] >= 0) {
                    penNo += 2;
                    maxnuts += getNuts(penNo);
                } else if (nuts[penNo + 1] < 0 && nuts[penNo + 2] < 0) {
                    if ((nuts[penNo + 1] < nuts[penNo + 2]) || (nuts[penNo + 1] == nuts[penNo + 2])) {
                        penNo += 2;
                        maxnuts += getNuts(penNo);
                        if (maxnuts < 0) {
                            maxnuts = 0;
                        }
                    } else if ((nuts[penNo + 1] > nuts[penNo + 2])) {
                        if (penNo + 3 < nuts.length) {
                            if ((nuts[penNo + 1] + nuts[penNo + 3]) > nuts[penNo + 2]) {
                                penNo += 1;
                                maxnuts += getNuts(penNo);
                                if (maxnuts < 0) {
                                    maxnuts = 0;
                                }
                            } else {
                                penNo += 2;
                                maxnuts += getNuts(penNo);
                                if (maxnuts < 0) {
                                    maxnuts = 0;
                                }
                            }
                        } else {
                            penNo += 1;
                            maxnuts += getNuts(penNo);
                            if (maxnuts < 0) {
                                maxnuts = 0;
                            }
                        }
                    }
                }
            } else if (penNo + 1 < this.nuts.length) {
                if (nuts[penNo + 1] >= 0) {
                    penNo++;
                    maxnuts += getNuts(penNo);
                } else {
                    penNo += 2;
                }
            } else {
                penNo++;
            }
        }
        return maxnuts;
    }
}
