package DuplicateObservedData;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/*
What I did

Goal of Duplicate Observed Data, remove processing and display

I'm just going to say what I think because its hard for me to refactor
this in my editor

I think we should move calculateLength and end out
of this class, to it's own data class that does
the computations, while the display
handles parseing the respective integers
*/

/*
What solutiond did

The actual solution made the interval store a string, for some reason

It made IntervalWindow implemented Observer,
so it would update anytime value changed

moved calculateLength and calculateEnd to interval
*/

class IntervalWindow extends Frame {
    java.awt.TextField startField;
    java.awt.TextField endField;
    java.awt.TextField lengthField;
    
    public IntervalWindow() {
        startField = new java.awt.TextField();
        endField = new java.awt.TextField();
        lengthField = new java.awt.TextField();
        SymFocus focusListener = new SymFocus();
        startField.addFocusListener(focusListener);
        endField.addFocusListener(focusListener);
        lengthField.addFocusListener(focusListener);
    }

    class SymFocus extends FocusAdapter {
        public void focusLost(FocusEvent event) {
            Object object = event.getSource();
            if(object == startField) {
                StartField_FocusLost(event);
            }
            else if(object == endField) {
                EndField_FocusLost(event);
            }
            else if(object == lengthField) {
                LengthField_FocusLost(event);
            }
        }

        void StartField_FocusLost(FocusEvent event) {
            if(isNotInteger(startField.getText())) {
                startField.setText("0");
            }
            calculateLength();
        }

        void EndField_FocusLost(FocusEvent event) {
            if(isNotInteger(endField.getText())) {
                endField.setText("0");
            }
            calculateLength();
        }

        void LengthField_FocusLost(FocusEvent event) {
            if(isNotInteger(lengthField.getText())) {
                lengthField.setText("0");
            }
            calculateEnd();
        }

        void calculateLength() {
            try {
                int start = Integer.parseInt(startField.getText());
                int end = Integer.parseInt(endField.getText());
                int length = end - start;
                lengthField.setText(String.valueOf(length));
            } catch(NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Format Error");
            }
        }

        void calculateEnd() {
            try {
                int start = Integer.parseInt(startField.getText());
                int length = Integer.parseInt(lengthField.getText());
                int end = start + length;
                endField.setText(String.valueOf(end));
            } catch(NumberFormatException e) {
                throw new RuntimeException("Unexpected Number Formt Error");
            }
        }

        // Required but not included in the original example
        private boolean isNotInteger(String text) {
            throw new UnsupportedOperationException("Unimplemented method 'isNotInteger'");
        }
    }
}