# -*- mode: python -*-

block_cipher = None


a = Analysis(['mondrianArt.py'],
             pathex=['C:\\Users\\Bhaskar Mishra\\OneDrive - Broward County Public Schools\\Documents\\AP Computer Science A\\Module 12\\Mondrian Art Generator'],
             binaries=[],
             datas=[],
             hiddenimports=[],
             hookspath=[],
             runtime_hooks=[],
             excludes=[],
             win_no_prefer_redirects=False,
             win_private_assemblies=False,
             cipher=block_cipher)
pyz = PYZ(a.pure, a.zipped_data,
             cipher=block_cipher)
exe = EXE(pyz,
          a.scripts,
          a.binaries,
          a.zipfiles,
          a.datas,
          name='mondrianArt',
          debug=False,
          strip=False,
          upx=True,
          runtime_tmpdir=None,
          console=False , icon='mondrianIcon.ico')
