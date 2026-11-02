from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(p/'Solution.java'),str(p/'Test.java')],check=True)
    subprocess.run(['java','-cp',d,'Test'],check=True)
