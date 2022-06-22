import pyautogui
import time

def sendSpambot1():
    time.sleep(5)

text = open('funada')
for each_line in text:
    pyautogui.typewrite(each_line)
    pyautogui.press('enter')
    