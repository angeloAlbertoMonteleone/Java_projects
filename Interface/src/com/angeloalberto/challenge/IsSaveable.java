package com.angeloalberto.challenge;

import java.util.ArrayList;
import java.util.List;

public interface IsSaveable {
    ArrayList<String> write();
    void read(List<String> savedValues);
}
