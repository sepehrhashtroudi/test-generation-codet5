public CpioArchiveEntry(final short format)
public CpioArchiveEntry(final String name)
public CpioArchiveEntry(final String name, final long size)
private void checkNewFormat()
private void checkOldFormat()
public long getChksum()
public long getDevice()
public long getDeviceMaj()
public long getDeviceMin()
public long getSize()
public short getFormat()
public long getGID()
public long getHeaderSize()
public long getInode()
public long getMode()
public String getName()
public long getNumberOfLinks()
public long getRemoteDevice()
public long getRemoteDeviceMaj()
public long getRemoteDeviceMin()
public long getTime()
public long getUID()
public boolean isBlockDevice()
public boolean isCharacterDevice()
public boolean isDirectory()
public boolean isNetwork()
public boolean isPipe()
public boolean isRegularFile()
public boolean isSocket()
public boolean isSymbolicLink()
public void setChksum(final long chksum)
public void setDevice(final long device)
public void setDeviceMaj(final long maj)
public void setDeviceMin(final long min)
public void setSize(final long size)
 final void setFormat(final short format)
public void setGID(final long gid)
public void setInode(final long inode)
public void setMode(final long mode)
public void setName(final String name)
public void setNumberOfLinks(final long nlink)
public void setRemoteDevice(final long device)
public void setRemoteDeviceMaj(final long rmaj)
public void setRemoteDeviceMin(final long rmin)
public void setTime(final long time)
public void setUID(final long uid)
long chksum=Optional[0]
short fileFormat=Optional[-1]
long filesize=Optional[0]
long gid=Optional[0]
long headerSize=Optional[-1]
long inode=Optional[0]
long maj=Optional[0]
long min=Optional[0]
long mode=Optional[-1]
long mtime=Optional[-1]
String name
long nlink=Optional[0]
long rmaj=Optional[0]
long rmin=Optional[0]
long uid=Optional[0]