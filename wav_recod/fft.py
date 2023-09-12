import scipy.io.wavfile as wavfile
import scipy
import scipy.signal
import scipy.fftpack as fftpk
import numpy as np
from matplotlib import pyplot as plt

s_rate, signal = wavfile.read("Voice_9.wav") 

FFT = abs(scipy.fft.fft(signal))
freqs = fftpk.fftfreq(len(FFT), (1.0/48000))

plt.plot(freqs[range(len(FFT)//2)], FFT[range(len(FFT)//2)])                                                          
plt.xlabel('Frequency (Hz)')
plt.ylabel('Amplitude')
plt.show()